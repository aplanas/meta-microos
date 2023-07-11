SUMMARY = "Haskell criterion library development files"
DESCRIPTION = "This package provides the Haskell criterion library development files."
LICENSE = "BSD-2-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-criterion-devel-1.6.2.0-2.2.aarch64.rpm"
RPM_HASH = "e9756b8a5bc4049bfd7b492352810ff9419c878712af249ee882f27480a2185af99a1d85b3707569894921f40669d17dfffea2fbddafa1d9481e95fa94f719f9"

RPROVIDES:${PN} += "ghc-criterion-devel \
ghc-devel-criterion-1.6.2.0-5spSpmuGxtIL4vjcevw11g"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-criterion \
ghc-devel-Glob-0.10.2-5tAj3lHfg0h9Pb5bOpMg4R \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-batteries-0.13.0-KDp9q4HxJ7BLLDYSknS7AR \
ghc-devel-binary-0.8.9.1 \
ghc-devel-binary-orphans-1.0.4.1-B9MBRQ7HLuSFecvHRdMPIR \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD \
ghc-devel-code-page-0.2.1-DXkPgctk3OAKMpgAjUBS3D \
ghc-devel-containers-0.6.7 \
ghc-devel-criterion-measurement-0.2.1.0-DbdcwZpcXTnArPRmwcriLh \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-js-chart-2.9.4.1-3Q5pmv83RztDkZZL9zv96d \
ghc-devel-microstache-1.0.2.3-HPIMoirZDKg7hPtdxDNWtL \
ghc-devel-mtl-2.2.2 \
ghc-devel-mwc-random-0.15.0.2-ABcRZBX2kH9CBf1bhFwgAP \
ghc-devel-optparse-applicative-0.18.1.0-EzAv0xKPJOa274kXT9Znff \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2 \
ghc-devel-prettyprinter-ansi-terminal-1.1.3-QQli2Jew8AdEXEsQuhGa \
ghc-devel-statistics-0.16.2.0-KAkoTXt1eFLCqUuIxaQQe3 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-devel-vector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6"

inherit rpm
