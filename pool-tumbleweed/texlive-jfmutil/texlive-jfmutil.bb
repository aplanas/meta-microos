SUMMARY = "Utility to process pTeX-extended TFM and VF"
DESCRIPTION = "This program provides functionality to process data files (JFM \
and VF) that form logical fonts used in (u)pTeX. The functions \
currently available include: The mutual conversion between \
Japanese virtual fonts (pairs of VF and JFM) and files in the \
'ZVP format', which is an original text format representing \
data in virtual fonts. This function can be seen as a \
counterpart to the vftovp/vptovf programs. The mutual \
conversion between VF files alone and files in the 'ZVP0 \
format', which is a subset of the ZVP format."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.3svn60987"

RPM_NAME = "texlive-jfmutil-2023.209.1.3.3svn60987-56.1.noarch.rpm"
RPM_HASH = "26e1734acc0af895bc55e6a5ff5bb477815f4e5a0fc5962f998a2155bdc74cdea98dcf24cd71a8558865486d0321a58ea4c460fbfd7cc5a3f90bbdee35692439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jfmutil"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Encode \
perl-IPC--Open3 \
perl-constant \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-jfmutil-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
