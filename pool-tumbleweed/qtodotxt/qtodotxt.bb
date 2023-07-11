SUMMARY = "User interface client for todo.txt files"
DESCRIPTION = "QTodoTxt is a graphical interface for the todo.txt format. \
 \
Todo.txt is a TODO list format in which the data is stored in a text \
file. Since todo.txt is both machine and human-readable, tasks can be \
checked out with alternative editors, and be synchronised with cloud \
sync tools such as Nextcloud, etc."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0"

RPM_NAME = "qtodotxt-1.9.0-3.2.noarch.rpm"
RPM_HASH = "903573f6825416dd23f3383d992f71a3f8026a0e9233307cd5f21f8290d4d7528db8ec1da330c4d615cb49c1c71bcd8988b5bdf9ebf6836bb454f63b61bac22f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-qtodotxt \
python3dist-qtodotxt \
qtodotxt"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-dateutil \
python3-qt5"

inherit rpm
