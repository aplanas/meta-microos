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

PV = "20.23.1"

RPM_NAME = "python39-virtualenv-20.23.1-1.1.noarch.rpm"
RPM_HASH = "bb7f3e7ef8acc8d47805cde472ca1d1edfc44845f662e36181a26104aa484aa990cd9debe0be93346802b5440e62406a7cf055173d5a5d77c3635c6b5c48f2d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-virtualenv \
python39-virtualenv \
python3dist-virtualenv"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-distlib \
python39-filelock \
python39-platformdirs \
update-alternatives"

inherit rpm
