SUMMARY = "Version-bump your software with a single command"
DESCRIPTION = "Version-bump your software with a single command! \
 \
bumpversion updates all version strings in your source tree by the correct \
increment, commits that change to git or Mercurial and tags it."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "bumpversion-0.6.0-1.6.noarch.rpm"
RPM_HASH = "ba6109b95298dffa813c2b72ba28c473a6d445256b5da2c0fc184a410b75c61cfd3a7182291800af2f8cb83ac871679d68d7ae216d3052ff064368cd3fe928a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumpversion \
python-bumpversion \
python3.11dist-bumpversion \
python3dist-bumpversion"

RDEPENDS:${PN} += "python3-base"

inherit rpm
