SUMMARY = "Buffering stdin and stdout"
DESCRIPTION = "This is a program designed to speed up writing tapes on remote tape \
drives.  When this program is put 'in the pipe,' two processes are \
started.  One process reads from standard-in and the other writes to \
standard-out.  Both processes communicate via shared memory."
LICENSE = "GPL-2.0-or-later"

PV = "1.19"

RPM_NAME = "buffer-1.19-867.13.aarch64.rpm"
RPM_HASH = "03e98f09cf00a0f6990756ad4197d589683706da3119a3f273db73a6e3afde586bb008a1d86d3a2693220dbc5c7fef46e96943b2892da5b0146805c31dde91a4"

RPROVIDES:${PN} += "buffer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
