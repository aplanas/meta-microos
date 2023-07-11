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

RPM_NAME = "python311-virtualenv-20.23.1-1.1.noarch.rpm"
RPM_HASH = "88e7c146123e2b03a0413b63a96e2c3ab2649dd9527bf2482fac003db1e9c6a54870a966d291bf3c1e3b1a6a7c4c4f28bfd760ba629d7c951db6dd9d319fb7ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virtualenv \
python3.11dist-virtualenv \
python311-virtualenv \
python3dist-virtualenv"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-distlib \
python311-filelock \
python311-platformdirs \
update-alternatives"

inherit rpm
