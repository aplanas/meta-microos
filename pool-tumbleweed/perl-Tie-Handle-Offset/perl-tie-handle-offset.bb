SUMMARY = "Tied handle that hides the beginning of a file"
DESCRIPTION = "This modules provides a file handle that hides the beginning of a file. \
After opening, the file is positioned at the offset location. 'seek()' and \
'tell()' calls are modified to preserve the offset. \
 \
For example, 'tell($fh)' will return 0, though the actual file position is \
at the offset. Likewise, 'seek($fh,80,0)' will seek to 80 bytes from the \
offset instead of 80 bytes from the actual start of the file."
LICENSE = "Apache-2.0"

PV = "0.004"

RPM_NAME = "perl-Tie-Handle-Offset-0.004-1.12.noarch.rpm"
RPM_HASH = "a2daa41deb89d938906902bdbac27f62cd9603c1346a44cc4aa4facd86cdeeae9399741a950264d9bdc67e068f811e159db1bb5e4f7f3831b99cd0f6cc8c2a6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--Handle--Offset \
perl-Tie--Handle--SkipHeader \
perl-Tie-Handle-Offset"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
