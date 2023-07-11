SUMMARY = "Framebuffer screenshot programs"
DESCRIPTION = "Contains fbcat and fbgrab for taking a screenshot using the framebuffer \
device. \
 \
Two executables are provided: \
 - Low-level fbcat that operates on the current virtual terminal and writes the \
   screenshot to stdout in the PPM format. \
 - High-level fbgrab that supports the PNG format and virtual terminal switching."
LICENSE = "GPL-2.0"

PV = "0.5.2"

RPM_NAME = "fbcat-0.5.2-1.8.aarch64.rpm"
RPM_HASH = "83a36565f12017f205082df8754ffc2edbd43d354aa8461929af08c506e15e96aba88be2dcc72ec70fbe4213ab5b4915c572660bdc4b4bf5daa5e0d447d0da29"

RPROVIDES:${PN} += "fbcat"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
