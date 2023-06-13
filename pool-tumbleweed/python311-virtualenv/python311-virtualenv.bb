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

RPM_NAME = "python311-virtualenv-20.23.0-1.1.noarch.rpm"
RPM_HASH = "437ab049b8314d1afbd00bcdbec80e866f06173f356f6d6d374d7be1962e26f4becb67153c2a5614eefba136e9db6cda5cf9fa4d56205b2948ecb2634910bb32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(virtualenv) \
python311-virtualenv \
python3dist(virtualenv)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-distlib \
python311-filelock \
python311-platformdirs \
update-alternatives"

inherit rpm
