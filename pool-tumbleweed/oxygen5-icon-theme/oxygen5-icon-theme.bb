SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the non-scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "oxygen5-icon-theme-5.107.0-1.1.noarch.rpm"
RPM_HASH = "7b0c13b857734746f625cb36443f1d4886564dbc99fede3971a8ae240ed4699d4e3e1a57f8bd88f5fbdd86201d17e612ee3d868a7abec0a5f0e7df1430a7f451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-icon-theme \
oxygen5-icon-theme"

RDEPENDS:${PN} += "hicolor-icon-theme"

inherit rpm
