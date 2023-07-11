SUMMARY = "Remote SCSI server"
DESCRIPTION = "The rscsi command is a remote generic SCSI transport server program. \
rscsi is a program that is run locally on the machine with SCSI \
devices, it is used by remote programs like cdrecord(1), cdda2wav(1), \
readcd(1), and sformat(1) that like to access SCSI devices through an \
interprocess communication connection via libscg.  rscsi is normally \
started up with an rexec(3) or rcmd(3) call but it may also be \
connected via an internal pipe to an ssh(1) session that was set up \
by the remote user."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "rscsi-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "51c68ce24dcc6c1c273cd7fc839ee458eac223e010c9fad1e8283593bb3329b501b717709a3c0f4d54dec98255ec75ade64d19ceeac7bad1b4211e37ef4a48f4"

RPROVIDES:${PN} += "cdrecord-/usr/sbin/rscsi \
config-rscsi \
rscsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdeflt.so.1.0 \
libscg.so.1.0 \
libschily.so.2.0"

inherit rpm
