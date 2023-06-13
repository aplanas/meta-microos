SUMMARY = "Intelligent predictive text entry platform (dbus service)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains the presage D-Bus service. \
 \
This package also contains a simple demonstration program that uses the D-Bus service."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "python3-dbus-presage-0.9.1-13.1.aarch64.rpm"
RPM_HASH = "baedf075410acd775f70d92c04ef16b3cd6784a607d6522111ee215dd859222b494be20b7bce1c78f83bee0cb3a72ec1b0b226fdab6bc9849eb257fc3801728f"

RPROVIDES:${PN} += "dbus-1-presage \
python3-dbus-presage \
python3-dbus-presage(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-dbus-python \
python3-presage"

inherit rpm
