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

RPM_NAME = "perl-Tie-Handle-Offset-0.004-1.10.noarch.rpm"
RPM_HASH = "e4d3497d3d14bb74c66d2c4dce1c3e9f2eb371acd960bd6f3c3cf2f746fd029774a5acdda1a675714fc23db881c0405d143e533fe343f1e290d60cb9ff699a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--Handle--Offset \
perl-Tie--Handle--SkipHeader \
perl-Tie-Handle-Offset"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
