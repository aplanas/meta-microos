SUMMARY = "Haskell mono-traversable library development files"
DESCRIPTION = "This package provides the Haskell mono-traversable library development \
files."
LICENSE = "MIT"

PV = "1.0.15.3"

RPM_NAME = "ghc-mono-traversable-devel-1.0.15.3-2.3.aarch64.rpm"
RPM_HASH = "4e6d3499875404a099359a2bffc87e6abf49bb3dffcc218e71434acc533f5c1d691536073e0e78a745e32094218147703db079f622b83b0677e7523731bba641"

RPROVIDES:${PN} += "ghc-devel(mono-traversable-1.0.15.3-IT8tyCr3vQLKgjlccagv2S) ghc-mono-traversable-devel ghc-mono-traversable-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(containers-0.6.7) ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) ghc-devel(split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf) ghc-devel(text-2.0.2) ghc-devel(transformers-0.5.6.2) ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) ghc-devel(vector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6) ghc-mono-traversable"

inherit rpm
