SUMMARY = "Virtual Python Environment builder"
DESCRIPTION = "virtualenv is a tool to create isolated Python environments. \
The basic problem being addressed is one of dependencies and versions, and \
indirectly permissions. Imagine you have an application that needs version 1 \
of LibFoo, but another application requires version 2. \
 \
Or more generally, what if you want to install an application and leave it be? \
If an application works, any change in its libraries or the versions of those \
libraries can break the application. \
 \
Also, what if you cant install packages into the global site-packages \
directory? For instance, on a shared host. \
 \
In all these cases, virtualenv can help you. It creates an environment that \
has its own installation directories, that doesnt share libraries with other \
virtualenv environments (and optionally doesnt use the globally installed \
libraries either)."
LICENSE = "MIT"

PV = "20.23.0"

RPM_NAME = "python39-virtualenv-20.23.0-1.1.noarch.rpm"
RPM_HASH = "4a2979012957df3e986bef6d724eb8d8a6d5e93111b8a77376084f1eca7a25213bbe89e7b4fb9c73dcdee17595e204682fa6df21e177b65cbb56f2f69ab82d13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-virtualenv \
python39-virtualenv \
python3dist-virtualenv"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-distlib \
python39-filelock \
python39-platformdirs \
update-alternatives"

inherit rpm
