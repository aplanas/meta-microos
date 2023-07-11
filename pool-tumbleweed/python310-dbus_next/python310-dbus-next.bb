SUMMARY = "A zero-dependency DBus library for Python with asyncio support"
DESCRIPTION = "python-dbus-next is a Python library for DBus that aims to be a fully featured high level library primarily geared towards integration of applications into Linux desktop and mobile environments. \
 \
Desktop application developers can use this library for integrating their applications into desktop environments by implementing common DBus standard interfaces or creating custom plugin interfaces. \
 \
Desktop users can use this library to create their own scripts and utilities to interact with those interfaces for customization of their desktop environment. \
 \
python-dbus-next plans to improve over other DBus libraries for Python in the following ways: \
 \
Zero dependencies and pure Python 3. \
Support for multiple IO backends including asyncio and the GLib main loop. \
Nonblocking IO suitable for GUI development. \
Target the latest language features of Python for beautiful services and clients. \
Complete implementation of the DBus type system without ever guessing types. \
Integration tests for all features of the library. \
Completely documented public API."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python310-dbus_next-0.2.3-1.11.noarch.rpm"
RPM_HASH = "d677ddcedd5f054586fae2cda4bc5de5061ba96745c2e61913038ecce471bb8b5055c53de2bf60fcff5fb234b2ee78e3deb62ac83f04b74e36d781a8d95b06c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dbus-next \
python310-dbus-next \
python3dist-dbus-next"

RDEPENDS:${PN} += "python-abi"

inherit rpm
