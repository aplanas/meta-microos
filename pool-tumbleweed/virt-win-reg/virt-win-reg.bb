SUMMARY = "Access and modify the Windows Registry of a Windows VM"
DESCRIPTION = "Virt-win-reg lets you look at and modify the Windows Registry of \
Windows virtual machines."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "virt-win-reg-1.50.1-1.2.noarch.rpm"
RPM_HASH = "d769c0da5d9e8f1669ec32887743c5aecf8a6c4689ae8a4a0967466db8cf095d12f2be23952ec7d6fce0ad97256847b7c7410f4b5cf55ee390388255cf33c8c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-win-reg"

RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
