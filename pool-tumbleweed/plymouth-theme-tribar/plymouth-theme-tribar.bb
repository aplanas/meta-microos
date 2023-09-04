SUMMARY = "Plymouth 'Tribar' theme"
DESCRIPTION = "This package contains the 'Tribar' boot splash theme for \
Plymouth"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-tribar-22.02.122+94.4bd41a3-9.1.noarch.rpm"
RPM_HASH = "5ac67af53d75696c27eb093494191719931305db6ec3586884f55c4793f1334e9db2c53fc9d4f58dae504ec19ea5fbcd88fbf49319ee770499079b36d67ca637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-tribar"

RDEPENDS:${PN} += "plymouth-plugin-tribar \
plymouth-scripts"

inherit rpm
