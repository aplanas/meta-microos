SUMMARY = "Haskell data-default library development files"
DESCRIPTION = "This package provides the Haskell data-default library development files."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.1"

RPM_NAME = "ghc-data-default-devel-0.7.1.1-10.2.aarch64.rpm"
RPM_HASH = "525314d8c67790802e7513c2a57b693536c223b3f6fda3ce2594e10d6ce8517d73732579509d1698e6de34812987241ed3fbd37fb21dca7ea55960ff0cf293ba"

RPROVIDES:${PN} += "ghc-data-default-devel \
ghc-data-default-devel(aarch-64) \
ghc-devel(data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-data-default \
ghc-devel(base-4.17.1.0) \
ghc-devel(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) \
ghc-devel(data-default-instances-containers-0.0.1-GsTPO88BTeU5gVKxrRffFz) \
ghc-devel(data-default-instances-dlist-0.0.1-Bmo6e1Lr8bt987tygJ1EBf) \
ghc-devel(data-default-instances-old-locale-0.0.1-7AZu0A9Np87C6EgyuU2uGo)"

inherit rpm
