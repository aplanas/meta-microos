SUMMARY = "Package for reading, writing and manipulating text-based subtitle files"
DESCRIPTION = "This is a Python package for reading, writing and manipulating \
text-based subtitle files. It is separate from the gaupol package, \
which provides a subtitle editor application with a GTK+ user \
interface."
LICENSE = "GPL-3.0-or-later"

PV = "1.12"

RPM_NAME = "python310-aeidon-1.12-1.3.noarch.rpm"
RPM_HASH = "0598a98e3d57232f1f875bbd79c28dcaa2f49ca51bb4b9a8bd460591e3eae396d211fc595d250c5e41962804bd0d39ab5f82d20aba80218ed512e5914ba5a92f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aeidon \
python310-aeidon"

RDEPENDS:${PN} += "python-abi \
typelib-Gspell"

inherit rpm
