SUMMARY = "Pygments theme for jupyterlab -- Jupyterlab extension files"
DESCRIPTION = "This package contains the Jupyterlab extension files for python-jupyterlab-pygments"
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "jupyter-jupyterlab-pygments-0.2.2-3.5.noarch.rpm"
RPM_HASH = "1ea6aaf8a5f8ac81574a660e96fdc2bfec74bd90768da87509e71487f50967d6d975a83dbe2e6d4282611f5aa98cf24b8f029f5730a64f9c74dac5e42a0c4a1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-pygments"

RDEPENDS:${PN} += ""

inherit rpm
