SUMMARY = "Haskell microlens-th library development files"
DESCRIPTION = "This package provides the Haskell microlens-th library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.13"

RPM_NAME = "ghc-microlens-th-devel-0.4.3.13-1.2.aarch64.rpm"
RPM_HASH = "f4b3ec2c5a723fc4cf4115d67f4393b6409d15dd4010a6acb5ebb0ce26142823c046f8b2a86bacec9c5e786ba57eb25bc40ee0fa2968818334b442e9f76614ab"

RPROVIDES:${PN} += "ghc-devel-microlens-th-0.4.3.13-K3KDbjSa5xkBUVjBxtDTLF \
ghc-microlens-th-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-th-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs \
ghc-devel-transformers-0.5.6.2 \
ghc-microlens-th"

inherit rpm
