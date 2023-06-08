SUMMARY = "Version-bump your software with a single command"
DESCRIPTION = "Version-bump your software with a single command! \
 \
bumpversion updates all version strings in your source tree by the correct \
increment, commits that change to git or Mercurial and tags it."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "bumpversion-0.6.0-1.5.noarch.rpm"
RPM_HASH = "33e15edf3eb593121da59de23a90a5460288bc38779f6085e482cc036a70479bcdaf0010577308b6a8097fda6c0b45f5c117eb0b30b215edf342d5d20415583b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumpversion python-bumpversion python3.10dist(bumpversion) python3dist(bumpversion)"
RDEPENDS:${PN} += "python3-base"

inherit rpm
