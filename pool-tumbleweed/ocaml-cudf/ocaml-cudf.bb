SUMMARY = "Ocaml CUDF library"
DESCRIPTION = "CUDF (for Common Upgradeability Description Format) is a format for describing upgrade scenarios in package-based Free and Open Source Software distribution. This is reference implementation in Ocaml."
LICENSE = "GPL-3.0-only"

PV = "0.9"

RPM_NAME = "ocaml-cudf-0.9-2.16.aarch64.rpm"
RPM_HASH = "dc2b28c2284511b5ddc95b58dd2fcd196f396694fb2ac2bcc330bcd99031cff5fb746a679bb8f23175367d687ad9a73dca8aaa079302914eb777494ef072caea"

RPROVIDES:${PN} += "ocaml-cudf"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
