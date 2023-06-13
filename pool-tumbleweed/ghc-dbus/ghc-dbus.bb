SUMMARY = "A client library for the D-Bus IPC system"
DESCRIPTION = "D-Bus is a simple, message-based protocol for inter-process communication, \
which allows applications to interact with other parts of the machine and the \
user's session using remote procedure calls. \
 \
D-Bus is a essential part of the modern Linux desktop, where it replaces \
earlier protocols such as CORBA and DCOP. \
 \
This library is an implementation of the D-Bus protocol in Haskell. It can be \
used to add D-Bus support to Haskell applications, without the awkward \
interfaces common to foreign bindings. \
 \
Example: connect to the session bus, and get a list of active names. \
 \
' &#x7b;-# LANGUAGE OverloadedStrings #-&#x7d; \
 \
import Data.List (sort) import DBus import DBus.Client \
 \
main = do &#x20; client <- connectSession &#x20; &#x20; -- Request a list of \
connected clients from the bus &#x20; reply <- call_ client (methodCall \
'/org/freedesktop/DBus' 'org.freedesktop.DBus' 'ListNames') &#x20; &#x7b; \
methodCallDestination = Just 'org.freedesktop.DBus' &#x20; &#x7d; &#x20; &#x20; \
-- org.freedesktop.DBus.ListNames() returns a single value, which is &#x20; -- \
a list of names (here represented as [String]) &#x20; let Just names = \
fromVariant (methodReturnBody reply !! 0) &#x20; &#x20; -- Print each name on a \
line, sorted so reserved names are below &#x20; -- temporary names. \
&#x20; mapM_ putStrLn (sort names) ' \
 \
>$ ghc --make list-names.hs >$ ./list-names >:1.0 >:1.1 >:1.10 >:1.106 >:1.109 \
>:1.110 >ca.desrt.dconf >org.freedesktop.DBus >org.freedesktop.Notifications \
>org.freedesktop.secrets >org.gnome.ScreenSaver."
LICENSE = "Apache-2.0"

PV = "1.2.28"

RPM_NAME = "ghc-dbus-1.2.28-1.3.aarch64.rpm"
RPM_HASH = "3c7e10d85525655fd1e68ed77bf9b76facadc00aa569ddcac8de644e712648e9855f529ba5bed717cb9c6b2379d9cd4dae1eb6c96e18eb80833b9a5c47d5672e"

RPROVIDES:${PN} += "ghc-dbus \
ghc-dbus(aarch-64) \
libHSdbus-1.2.28-27GbkRPSCRwKgi0yxoNYFh-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSOneTuple-0.3.1-IKxZBiZNgF5H3QnFEzgDrd-ghc9.4.5.so()(64bit) \
libHSStateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN-ghc9.4.5.so()(64bit) \
libHSadjunctions-4.4.2-7RBwcclil4HKBSm6i086HA-ghc9.4.5.so()(64bit) \
libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSassoc-1.0.2-IAwklVGxRFw6xcadvaWWl7-ghc9.4.5.so()(64bit) \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so()(64bit) \
libHSattoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3-ghc9.4.5.so()(64bit) \
libHSattoparsec-0.14.4-JfIUPSNLtNQH9xUGOplWef-attoparsec-internal-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so()(64bit) \
libHSbifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy-ghc9.4.5.so()(64bit) \
libHSblaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW-ghc9.4.5.so()(64bit) \
libHSblaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR-ghc9.4.5.so()(64bit) \
libHSblaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScall-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk-ghc9.4.5.so()(64bit) \
libHScereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f-ghc9.4.5.so()(64bit) \
libHScomonad-5.0.8-9UnH7KDg5138z3eBCPM7y4-ghc9.4.5.so()(64bit) \
libHSconduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2-ghc9.4.5.so()(64bit) \
libHSconduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHScontravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao-ghc9.4.5.so()(64bit) \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSdistributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79-ghc9.4.5.so()(64bit) \
libHSexceptions-0.10.5-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSfree-5.1.10-7AdTZukDGhL7qWMpdopXbC-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) \
libHSindexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs-ghc9.4.5.so()(64bit) \
libHSindexed-traversable-instances-0.1.1.2-9bsLKqKio7c19LOJlUsRRO-ghc9.4.5.so()(64bit) \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so()(64bit) \
libHSinvariant-0.6.1-B19sct74tP6Cqvpbmm6WZv-ghc9.4.5.so()(64bit) \
libHSkan-extensions-5.2.5-1nBOp7PexbvGHkzwfeC2dO-ghc9.4.5.so()(64bit) \
libHSlens-5.2.2-2MO0prnPqCQBRfua8fH2Ea-ghc9.4.5.so()(64bit) \
libHSmono-traversable-1.0.15.3-IT8tyCr3vQLKgjlccagv2S-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so()(64bit) \
libHSparallel-3.2.2.0-36KAHtmQlbB59K6tPbQ0Jr-ghc9.4.5.so()(64bit) \
libHSparsec-3.1.16.1-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so()(64bit) \
libHSprocess-1.6.16.0-ghc9.4.5.so()(64bit) \
libHSprofunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV-ghc9.4.5.so()(64bit) \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so()(64bit) \
libHSreflection-2.1.7-KcOWE7PS1mHy6gA2edHvV-ghc9.4.5.so()(64bit) \
libHSresourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv-ghc9.4.5.so()(64bit) \
libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so()(64bit) \
libHSsemigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1-ghc9.4.5.so()(64bit) \
libHSsemigroups-0.20-KtsaS4jNcGkoC9puVZ6vB-ghc9.4.5.so()(64bit) \
libHSsplit-0.2.3.5-u3oGLAiW7JJbxIffWSCWf-ghc9.4.5.so()(64bit) \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHSstreaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G-ghc9.4.5.so()(64bit) \
libHSstrict-0.4.0.1-74sO97OC4FSJXzLQO4CTJi-ghc9.4.5.so()(64bit) \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so()(64bit) \
libHSth-lift-0.8.3-BVnK9vFPlpnBx7d6MzGvJN-ghc9.4.5.so()(64bit) \
libHSthese-1.1.1.1-3POHYes25uBIW53bcrDd39-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHStransformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp-ghc9.4.5.so()(64bit) \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so()(64bit) \
libHStyped-process-0.2.11.0-AJYHFlIHznQBMeAWc6SvCO-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libHSunliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj-ghc9.4.5.so()(64bit) \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so()(64bit) \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so()(64bit) \
libHSvector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6-ghc9.4.5.so()(64bit) \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so()(64bit) \
libHSvoid-0.7.3-GHzyjd8VkpoJvEZLjo6Bsz-ghc9.4.5.so()(64bit) \
libHSxml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4-ghc9.4.5.so()(64bit) \
libHSxml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb-ghc9.4.5.so()(64bit) \
libHSzlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
