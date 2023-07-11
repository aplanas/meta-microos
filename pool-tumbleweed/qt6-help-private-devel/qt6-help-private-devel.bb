SUMMARY = "Non-ABI stable API for the Qt 6 Help library"
DESCRIPTION = "This package provides private headers of libQt6Help that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-help-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "eed91bf0a8360af6cbbecd12235bd88e8b3f724426a711133cc4c79b685fa07f253e742283afe4cd328f1d24790972e056ec2a6a468238d20e72c3a78fd023c7"

RPROVIDES:${PN} += "qt6-help-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Help \
qt6-core-private-devel"

inherit rpm
