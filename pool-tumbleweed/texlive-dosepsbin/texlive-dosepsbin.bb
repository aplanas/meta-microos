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

PV = "2023.209.1.2svn29752"

RPM_NAME = "texlive-dosepsbin-2023.209.1.2svn29752-53.1.noarch.rpm"
RPM_HASH = "c2e981ff23240d01b4dc1780f96b096967f7c104ed6f2408d9d17e499e4cb3da6a8aa4f20469ed0f21bc588e00fa9fbd32f54a7a29efb6fa2ecf55d8c306f575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dosepsbin"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-Pod--Usage \
perl-strict \
sed \
texlive \
texlive-dosepsbin-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
