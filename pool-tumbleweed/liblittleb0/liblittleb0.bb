SUMMARY = "Bluetooth Low Energy library"
DESCRIPTION = "LittleB provides a Bluetooth Low Energy API. It exposes the BLE GATT \
API for C using BlueZ over SD-Bus. \
 \
This package contains shared library for littleb."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "liblittleb0-0.1.2-1.22.aarch64.rpm"
RPM_HASH = "2e598c671c39e1ab3c47105a9c0d5fe73d4371885df3dec9bca0a7ae72729459d0194064daad131420f7efb69005183b0c274b9e39282677117c448a1f9124aa"

RPROVIDES:${PN} += "liblittleb.so.0 \
liblittleb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
