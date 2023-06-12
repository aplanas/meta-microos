SUMMARY = "A small INI library for Python"
DESCRIPTION = "A small INI library for Python."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python311-inifile-0.4.1-1.7.noarch.rpm"
RPM_HASH = "48acfe673bfcd700a150a730ce80d61cc492cc54232f56115f7aa96e2e287d8ac93f528ff1fc53a90a8cf3780ececaef23fb6fce1cd3c738f0f4b5a9d3582116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(inifile) \
python311-inifile \
python3dist(inifile)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
