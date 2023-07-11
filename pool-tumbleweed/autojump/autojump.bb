SUMMARY = "A faster way to navigate the filesystem from a shell"
DESCRIPTION = "autojump is a faster way to navigate one's filesystem. It works by \
maintaining a database of the directories one uses the most from \
the command line. \
 \
Directories must be visited first before they can be jumped to."
LICENSE = "GPL-3.0-or-later"

PV = "22.5.3"

RPM_NAME = "autojump-22.5.3-2.5.noarch.rpm"
RPM_HASH = "922e9b58f91dceb0eb92813d3fe9c8d19a642ff16ecf2dd0353c739f5ae49f49ce6fd0a4b9ae102783cd2e049f138a24e5e875d01c986fcda6704f45b8964899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autojump \
config-autojump"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
