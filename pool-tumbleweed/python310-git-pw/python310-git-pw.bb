SUMMARY = "A tool for integrating Git with Patchwork"
DESCRIPTION = "git-pw is a tool for integrating Git with Patchwork, the web-based patch \
tracking system."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python310-git-pw-2.4.0-2.2.noarch.rpm"
RPM_HASH = "1b3827f80e8b651c062f87ceaa0b966d333332cdbbac7d3e81a1ca8d163cbb43b7f5fa5da8bac266313e49c54fde73908d6725681179c267bafca475c959f45b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-pw \
python3-git-pw \
python3.10dist(git-pw) \
python310-git-pw \
python3dist(git-pw)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
git-core \
python(abi) \
python310-arrow \
python310-click \
python310-pyaml \
python310-requests \
python310-tabulate \
update-alternatives"

inherit rpm
