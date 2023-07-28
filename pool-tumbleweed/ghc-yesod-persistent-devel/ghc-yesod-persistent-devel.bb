SUMMARY = "Haskell yesod-persistent library development files"
DESCRIPTION = "This package provides the Haskell yesod-persistent library development \
files."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-devel-1.6.0.8-2.10.aarch64.rpm"
RPM_HASH = "be72004f59ee7b48f93511f63fe03a8dc283ace5bc76043cbc8fddc303507bc82afba05b28c67a11f34cc35fabc1280db7fdc9f40edadbd78e7d6d8c71bd114f"

RPROVIDES:${PN} += "ghc-devel-yesod-persistent-1.6.0.8-A587fdCgueU2UmsZUmFzaX \
ghc-yesod-persistent-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-devel-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-devel-persistent-2.14.5.1-8aZiHAHWity6p3rqRx3MdJ \
ghc-devel-resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-yesod-core-1.6.24.3-FuwsWoOUEyTCufqnix4g5P \
ghc-yesod-persistent"

inherit rpm
