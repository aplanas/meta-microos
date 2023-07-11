SUMMARY = "Haskell criterion profiling library"
DESCRIPTION = "This package provides the Haskell criterion profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-criterion-prof-1.6.2.0-2.2.aarch64.rpm"
RPM_HASH = "6b15339296b0e67493bb1134658f62c4cf5329af28490b26d174ab1e9e30221085fb839bd72ac82259c9b501fb3ce6065594ac978f18e39d9e3bb857ecef2207"

RPROVIDES:${PN} += "ghc-criterion-prof \
ghc-prof-criterion-1.6.2.0-5spSpmuGxtIL4vjcevw11g"

RDEPENDS:${PN} += "ghc-criterion-devel \
ghc-prof-Glob-0.10.2-5tAj3lHfg0h9Pb5bOpMg4R \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0 \
ghc-prof-base-compat-batteries-0.13.0-KDp9q4HxJ7BLLDYSknS7AR \
ghc-prof-binary-0.8.9.1 \
ghc-prof-binary-orphans-1.0.4.1-B9MBRQ7HLuSFecvHRdMPIR \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD \
ghc-prof-code-page-0.2.1-DXkPgctk3OAKMpgAjUBS3D \
ghc-prof-containers-0.6.7 \
ghc-prof-criterion-measurement-0.2.1.0-DbdcwZpcXTnArPRmwcriLh \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-js-chart-2.9.4.1-3Q5pmv83RztDkZZL9zv96d \
ghc-prof-microstache-1.0.2.3-HPIMoirZDKg7hPtdxDNWtL \
ghc-prof-mtl-2.2.2 \
ghc-prof-mwc-random-0.15.0.2-ABcRZBX2kH9CBf1bhFwgAP \
ghc-prof-optparse-applicative-0.18.1.0-EzAv0xKPJOa274kXT9Znff \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2 \
ghc-prof-prettyprinter-ansi-terminal-1.1.3-QQli2Jew8AdEXEsQuhGa \
ghc-prof-statistics-0.16.2.0-KAkoTXt1eFLCqUuIxaQQe3 \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-prof-vector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6"

inherit rpm
