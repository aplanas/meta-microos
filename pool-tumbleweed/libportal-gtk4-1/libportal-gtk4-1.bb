SUMMARY = "Shared library for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the shared library of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "libportal-gtk4-1-0.6-1.8.aarch64.rpm"
RPM_HASH = "fe5a00c15dc74fc6944abdff51ad22ee9205234f8ea3b86c64ddd1b8bd069eb69172ae46df405f76a92a21b3f2a003c0ef7cd4f03bded6c63656fb4ccd0195ee"

RPROVIDES:${PN} += "libportal-gtk4-1 \
libportal-gtk4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
