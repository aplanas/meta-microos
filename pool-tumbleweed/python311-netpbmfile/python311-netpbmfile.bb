SUMMARY = "Read and write image files in the Netpbm format"
DESCRIPTION = "Netpbmfile is a Python library to read and write image files in the Netpbm \
format."
LICENSE = "BSD-3-Clause"

PV = "2020.10.18"

RPM_NAME = "python311-netpbmfile-2020.10.18-2.10.noarch.rpm"
RPM_HASH = "57fa3bb09bb8df0b41c7acdbfacddc56e8ea7806b48b28aeda777d85218a4daad594a1595efd98e6251f844bf5b7ed825bb27c2761b9530e41da9f83e4e6aaf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-netpbmfile \
python311-netpbmfile \
python3dist-netpbmfile"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-matplotlib \
python311-numpy \
update-alternatives"

inherit rpm
