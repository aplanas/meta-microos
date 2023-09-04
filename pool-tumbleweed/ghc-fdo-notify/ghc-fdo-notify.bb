SUMMARY = "Desktop Notifications client"
DESCRIPTION = "A library for issuing notifications using FreeDesktop.org's Desktop \
Notifications protcol. This protocol is supported by services such as Ubuntu's \
NotifyOSD."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-fdo-notify-0.3.1-4.9.aarch64.rpm"
RPM_HASH = "4a761f38270ba7af6ffbedbc84a9615a382e4178dafb1244174cb9760451af81d63eebfbafababf01963c8b939d27ba5799cd2e3a8cc7e35e77207e1d3e47242"

RPROVIDES:${PN} += "ghc-fdo-notify \
libHSfdo-notify-0.3.1-LNbhlfz8W8WFAdKkUx9okE-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSOneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI-ghc9.4.6.so \
libHSStateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J-ghc9.4.6.so \
libHSadjunctions-4.4.2-BjNTDSboJHWDpWX9BvuZL3-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSassoc-1.1-J44kuPbAMT5GyespKCFdbT-ghc9.4.6.so \
libHSasync-2.2.4-LcXCzTmy8C6G7Wa774EctI-ghc9.4.6.so \
libHSattoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3-ghc9.4.6.so \
libHSattoparsec-0.14.4-LxL1eX1xmPCB2HEhQefy3f-attoparsec-internal-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5-ghc9.4.6.so \
libHSbifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbitvec-1.1.5.0-4n2vDaVO5x4GAoTGOlyPxS-ghc9.4.6.so \
libHSblaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h-ghc9.4.6.so \
libHSblaze-html-0.9.1.2-7UiwTnqTAqaHumXjuOqwSX-ghc9.4.6.so \
libHSblaze-markup-0.8.2.8-FMWPznpLq5tCe2Goi5eAy9-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScall-stack-0.4.0-nQZfFxinEdIa1BWxMyadt-ghc9.4.6.so \
libHScereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I-ghc9.4.6.so \
libHScomonad-5.0.8-56nFbOwllOwBl7FMfSy83E-ghc9.4.6.so \
libHSconduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX-ghc9.4.6.so \
libHSconduit-extra-1.3.6-370xQw6Laeb4Jkz5zTLBuf-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScontravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSdbus-1.2.29-AAIySIFW0zz7mxLdRwt0V6-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSdistributive-0.6.2.1-7gHlNDSCz3vFkde299iroS-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSfoldable1-classes-compat-0.1-HnLXxvPXYXbHggM07qAxsy-ghc9.4.6.so \
libHSfree-5.1.10-8DOWW3JiZaX7obxPZwBWX0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSindexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO-ghc9.4.6.so \
libHSindexed-traversable-instances-0.1.1.2-4xmEkkFhOqh6ApH5IPswPQ-ghc9.4.6.so \
libHSinteger-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO-ghc9.4.6.so \
libHSinvariant-0.6.2-1eF4QVqz69AFovgmNz4wk7-ghc9.4.6.so \
libHSkan-extensions-5.2.5-8EOcrvzPSBS2QFPhIHEfWy-ghc9.4.6.so \
libHSlens-5.2.2-9FQiMfULngUCqLz60VkKPe-ghc9.4.6.so \
libHSmono-traversable-1.0.15.3-LJDObfSqMuwFAwfZMa8qoW-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSnetwork-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs-ghc9.4.6.so \
libHSparallel-3.2.2.0-4HmomK1BnRHCRUDqhNxOgQ-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHSprofunctors-5.6.2-GfNUFxHNpLn859duquR0iv-ghc9.4.6.so \
libHSrandom-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k-ghc9.4.6.so \
libHSreflection-2.1.7-1WygFxHmxkcEQBv8T6gHut-ghc9.4.6.so \
libHSresourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP-ghc9.4.6.so \
libHSscientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz-ghc9.4.6.so \
libHSsemigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g-ghc9.4.6.so \
libHSsemigroups-0.20-6lktLD0mxwZ1Pjuc7q3dSl-ghc9.4.6.so \
libHSsplit-0.2.3.5-J6pekuQs6yKFxqDJQyglHu-ghc9.4.6.so \
libHSsplitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHSstreaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z-ghc9.4.6.so \
libHSstrict-0.5-430Uicv2DUP1jZqwf2ycOP-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHSth-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs-ghc9.4.6.so \
libHSth-lift-0.8.4-Hb96g2HGtQyHkKuMt8Wl3a-ghc9.4.6.so \
libHSthese-1.2-5fSFdT8DGhg7GQONqvd4MR-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libHStyped-process-0.2.11.0-D02VU1fccqSD0M6BP6Pfz9-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSunliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-algorithms-0.9.0.1-98Yktb3BX9p4L0Cowik6Gr-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libHSvoid-0.7.3-GhXmDKlBHl0LbXoxVMxAU0-ghc9.4.6.so \
libHSxml-conduit-1.9.1.3-DDoR4rlzTH6QSHmFsTVd9-ghc9.4.6.so \
libHSxml-types-0.3.8-8dFL1RqlGPRJfvDIVn7kl6-ghc9.4.6.so \
libHSzlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
