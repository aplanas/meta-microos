SUMMARY = "Haskell haskell-lexer profiling library"
DESCRIPTION = "This package provides the Haskell haskell-lexer profiling library."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-haskell-lexer-prof-1.1.1-2.8.aarch64.rpm"
RPM_HASH = "ad1f8093f5bb56a19ca8897873c4d962d9dfedae277f2f846f94d7397fb221bce2dcd5c420e94284bc9d316dc31245b68d0a608ac8a62045bc7f81832beb7f7a"

RPROVIDES:${PN} += "ghc-haskell-lexer-prof \
ghc-prof-haskell-lexer-1.1.1-C14Cmw3wUWQ88vb32sfZ2Z"

RDEPENDS:${PN} += "ghc-haskell-lexer-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
