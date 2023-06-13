SUMMARY = "Haskell wai-cors library development files"
DESCRIPTION = "This package provides the Haskell wai-cors library development files."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "ghc-wai-cors-devel-0.2.7-1.2.aarch64.rpm"
RPM_HASH = "30f0ea5e711aa01ae72559c4262f08880cda85a955541be5b26e5f2d1c22be8dcea12fc360a723c0b92ec4df1313ae5aef0f819f257afe9ef8ad87ed34e464b5"

RPROVIDES:${PN} += "ghc-devel(wai-cors-0.2.7-CSepwpjFO1f9DnlkYc71mV) \
ghc-wai-cors-devel \
ghc-wai-cors-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-devel(base-4.17.1.0) \
ghc-devel(base-unicode-symbols-0.2.4.2-2uW4hd16ZmNBkWsH22htOC) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) \
ghc-devel(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) \
ghc-devel(mtl-2.2.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) \
ghc-wai-cors"

inherit rpm
