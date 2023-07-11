SUMMARY = "A secure replacement for rm"
DESCRIPTION = "Unlike the standard rm, srm overwrites the data in the target files before unlinking them. This prevents command-line recovery of the data by examining the raw block device. It may also help frustrate physical examination of the disk, although it's unlikely that it can completely prevent that type of recovery. It is, essentially, a paper shredder for sensitive files. \
 \
srm is ideal for personal computers or workstations with Internet connections. It can help prevent malicious users from breaking in and undeleting personal files, such as old emails. It's also useful for permanently removing files from expensive media. For example, cleaning your diary off the zip disk you're using to send vacation pictures to Uncle Lou. Because it uses the exact same options as rm(1), srm is simple to use. Just subsitute it for rm whenever you want to destroy files, rather than just unlinking them."
LICENSE = "SGI-B-2.0"

PV = "1.2.15"

RPM_NAME = "srm-1.2.15-3.3.aarch64.rpm"
RPM_HASH = "1913815dd1e61c729b4292680a38abb30bd71209c544a02e0091e3a1770c71ccd6c5ae9f7600e146b6af919172dcf68719b8b1e6df87b02702c5a94565f909e0"

RPROVIDES:${PN} += "srm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
