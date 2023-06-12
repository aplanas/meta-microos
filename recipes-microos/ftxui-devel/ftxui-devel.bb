SUMMARY = "Devel files for ftxui"
DESCRIPTION = "Development files for ftxui."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "ftxui-devel-4.1.1-1.1.aarch64.rpm"
RPM_HASH = "0994f7e6c8f18463bbd91622648473de874c48cd23fadd11f276b7b6170422cd3269d46575bb6143e95983659dc992d20bdd1f346ec2a1d5892393995f97197c"

RPROVIDES:${PN} += "cmake(ftxui) ftxui ftxui-devel ftxui-devel(aarch-64)"
RDEPENDS:${PN} += "libftxui4_1_0"

inherit rpm
