SUMMARY = "User interface client for todo.txt files"
DESCRIPTION = "QTodoTxt is a graphical interface for the todo.txt format. \
 \
Todo.txt is a TODO list format in which the data is stored in a text \
file. Since todo.txt is both machine and human-readable, tasks can be \
checked out with alternative editors, and be synchronised with cloud \
sync tools such as Nextcloud, etc."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0"

RPM_NAME = "qtodotxt-1.9.0-3.1.noarch.rpm"
RPM_HASH = "def3d5739ac70d0a90611ec090ded82aea6ee65252ca711d52078622f8e5516341be824c959dc200af86efd9a1ff318139b89fe0f360b42f512d3a3ac897b863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-qtodotxt \
python3dist-qtodotxt \
qtodotxt"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-dateutil \
python3-qt5"

inherit rpm
