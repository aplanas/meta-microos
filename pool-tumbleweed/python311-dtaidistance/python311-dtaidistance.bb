SUMMARY = "Dynamic Time Warping (DTW) package"
DESCRIPTION = "Library for time series distances (e.g. Dynamic Time Warping, DTW)."
LICENSE = "Apache-2.0"

PV = "2.3.10"

RPM_NAME = "python311-dtaidistance-2.3.10-2.6.aarch64.rpm"
RPM_HASH = "83f038a36f42e748ce0281ede934fe4ec3639405596c82a7a3200943037094678bbf5717acee48e6c53571cb321e206d8bf00bcc5e5a0e95e9274444169c1bd6"

RPROVIDES:${PN} += "python3-dtaidistance \
python3.11dist-dtaidistance \
python311-dtaidistance \
python3dist-dtaidistance"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
python-abi"

inherit rpm
