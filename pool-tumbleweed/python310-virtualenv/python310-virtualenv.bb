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

RPM_NAME = "python310-virtualenv-20.23.1-1.1.noarch.rpm"
RPM_HASH = "718e5f853c5b95d799f0dd583376442e94429c3b05fcb00cf48e3bf18f1ea8b1a0b41be633debb5c510271dce534fff19a8a645b3a3be12d1b4197f0767eeb4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-virtualenv \
python310-virtualenv \
python3dist-virtualenv"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-distlib \
python310-filelock \
python310-platformdirs \
update-alternatives"

inherit rpm
