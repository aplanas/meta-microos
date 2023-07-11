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

RPM_NAME = "perl-Tie-Handle-Offset-0.004-1.11.noarch.rpm"
RPM_HASH = "83c1825b639c451327df247ee1b3f21d0b8231f32ded31f335ab9f527d41b452adf595683a6e4386f0f63afa17e8cbd2b97b8f3167a1c48c050ea3ede824bb07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--Handle--Offset \
perl-Tie--Handle--SkipHeader \
perl-Tie-Handle-Offset"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
