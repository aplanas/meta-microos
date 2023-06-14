SUMMARY = "Haskell invariant profiling library"
DESCRIPTION = "This package provides the Haskell invariant profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-invariant-prof-0.6.1-1.3.aarch64.rpm"
RPM_HASH = "34aab095fac87bf12522ae694ce8a87fd2c101b93d6417e42b9e8fa19543804f31e2a32f0529d5ac201f78eb7254cb175d75f932951c41ecb4f5b24637a05b65"

RPROVIDES:${PN} += "ghc-invariant-prof \
ghc-prof-invariant-0.6.1-B19sct74tP6Cqvpbmm6WZv"

RDEPENDS:${PN} += "ghc-invariant-devel \
ghc-prof-StateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL \
ghc-prof-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4 \
ghc-prof-containers-0.6.7 \
ghc-prof-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-profunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV \
ghc-prof-stm-2.5.1.0 \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E"

inherit rpm
