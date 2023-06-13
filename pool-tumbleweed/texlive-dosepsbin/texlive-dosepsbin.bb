SUMMARY = "Deal with DOS binary EPS files"
DESCRIPTION = "A Encapsulated PostScript (EPS) file may given in a special \
binary format to support the inclusion of a thumbnail. This \
file format, commonly known as DOS EPS format starts with a \
binary header that contains the positions of the possible \
sections: PostScript (PS); Windows Metafile Format (WMF); and \
Tag Image File Format (TIFF). The PS section must be present \
and either the WMF file or the TIFF file should be given. The \
package provides a Perl program that will extract any of the \
sections of such a file, in particular providing a 'text'-form \
EPS file for use with (La)TeX."
LICENSE = "Artistic-1.0"

PV = "2023.201.1.2svn29752"

RPM_NAME = "texlive-dosepsbin-2023.201.1.2svn29752-52.1.noarch.rpm"
RPM_HASH = "d951ce62cfa2b54c59918b71e487d27c242ad549745b9d34f78445f6df43686fc917ca95ea5a4db0ed5b83e7988307a45b16513cf28b44e3919721d0007574e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dosepsbin"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Getopt::Long) \
perl(Pod::Usage) \
perl(strict) \
sed \
texlive \
texlive-dosepsbin-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
