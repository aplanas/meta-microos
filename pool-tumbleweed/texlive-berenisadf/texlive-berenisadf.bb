SUMMARY = "Berenis ADF fonts and TeX/LaTeX support"
DESCRIPTION = "The bundle provides the BerenisADF Pro font collection, in \
OpenType and PostScript Type 1 formats, together with support \
files to use the fonts in TeXnANSI (LY1) and LaTeX standard T1 \
and TS1 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.004svn32215"

RPM_NAME = "texlive-berenisadf-2023.201.1.004svn32215-53.1.noarch.rpm"
RPM_HASH = "d60066c96a93ef74ba52d190b6bf877aa625a904cb069c0cd7beeb70436ea58584147ffb3152cbbbad0e69006fe445b5f437339a3789132aef9b25070133a4c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(berenis.sty) \
tex(ly1ybd.fd) \
tex(ly1ybd0.fd) \
tex(ly1ybd1.fd) \
tex(ly1ybd2.fd) \
tex(ly1ybd2j.fd) \
tex(ly1ybd2jw.fd) \
tex(ly1ybd2w.fd) \
tex(ly1ybdj.fd) \
tex(ly1ybdjw.fd) \
tex(ly1ybdw.fd) \
tex(t1-ybd.enc) \
tex(t1-ybd0.enc) \
tex(t1-ybd1.enc) \
tex(t1-ybd2.enc) \
tex(t1-ybd2j.enc) \
tex(t1-ybdj.enc) \
tex(t1ybd.fd) \
tex(t1ybd0.fd) \
tex(t1ybd1.fd) \
tex(t1ybd2.fd) \
tex(t1ybd2j.fd) \
tex(t1ybdj.fd) \
tex(texnansi-ybd.enc) \
tex(texnansi-ybd0.enc) \
tex(texnansi-ybd1.enc) \
tex(texnansi-ybd2.enc) \
tex(texnansi-ybd2j.enc) \
tex(texnansi-ybdj.enc) \
tex(texnansx-ybd2jw.enc) \
tex(texnansx-ybd2w.enc) \
tex(texnansx-ybdjw.enc) \
tex(texnansx-ybdw.enc) \
tex(ts1-ybd.enc) \
tex(ts1-ybd0.enc) \
tex(ts1-ybd1.enc) \
tex(ts1-ybd2.enc) \
tex(ts1-ybd2j.enc) \
tex(ts1-ybdj.enc) \
tex(ts1ybd.fd) \
tex(ts1ybd0.fd) \
tex(ts1ybd1.fd) \
tex(ts1ybd2.fd) \
tex(ts1ybd2j.fd) \
tex(ts1ybdj.fd) \
tex(ybd.map) \
tex(ybdb08c.tfm) \
tex(ybdb08t.tfm) \
tex(ybdb08y.tfm) \
tex(ybdb0c8c.tfm) \
tex(ybdb0c8t.tfm) \
tex(ybdb0c8y.tfm) \
tex(ybdb0ci8c.tfm) \
tex(ybdb0ci8t.tfm) \
tex(ybdb0ci8y.tfm) \
tex(ybdb0i8c.tfm) \
tex(ybdb0i8t.tfm) \
tex(ybdb0i8y.tfm) \
tex(ybdb18c.tfm) \
tex(ybdb18t.tfm) \
tex(ybdb18y.tfm) \
tex(ybdb1c8c.tfm) \
tex(ybdb1c8t.tfm) \
tex(ybdb1c8y.tfm) \
tex(ybdb1ci8c.tfm) \
tex(ybdb1ci8t.tfm) \
tex(ybdb1ci8y.tfm) \
tex(ybdb1i8c.tfm) \
tex(ybdb1i8t.tfm) \
tex(ybdb1i8y.tfm) \
tex(ybdb28c.tfm) \
tex(ybdb28t.tfm) \
tex(ybdb28y.tfm) \
tex(ybdb2c8c.tfm) \
tex(ybdb2c8t.tfm) \
tex(ybdb2c8y.tfm) \
tex(ybdb2ci8c.tfm) \
tex(ybdb2ci8t.tfm) \
tex(ybdb2ci8y.tfm) \
tex(ybdb2cij8c.tfm) \
tex(ybdb2cij8t.tfm) \
tex(ybdb2cij8y.tfm) \
tex(ybdb2cijw8y.tfm) \
tex(ybdb2ciw8y.tfm) \
tex(ybdb2cj8c.tfm) \
tex(ybdb2cj8t.tfm) \
tex(ybdb2cj8y.tfm) \
tex(ybdb2cjw8y.tfm) \
tex(ybdb2cw8y.tfm) \
tex(ybdb2i8c.tfm) \
tex(ybdb2i8t.tfm) \
tex(ybdb2i8y.tfm) \
tex(ybdb2ij8c.tfm) \
tex(ybdb2ij8t.tfm) \
tex(ybdb2ij8y.tfm) \
tex(ybdb2ijw8y.tfm) \
tex(ybdb2iw8y.tfm) \
tex(ybdb2j8c.tfm) \
tex(ybdb2j8t.tfm) \
tex(ybdb2j8y.tfm) \
tex(ybdb2jw8y.tfm) \
tex(ybdb2w8y.tfm) \
tex(ybdb8c.tfm) \
tex(ybdb8t.tfm) \
tex(ybdb8y.tfm) \
tex(ybdbc8c.tfm) \
tex(ybdbc8t.tfm) \
tex(ybdbc8y.tfm) \
tex(ybdbci8c.tfm) \
tex(ybdbci8t.tfm) \
tex(ybdbci8y.tfm) \
tex(ybdbcij8c.tfm) \
tex(ybdbcij8t.tfm) \
tex(ybdbcij8y.tfm) \
tex(ybdbcijw8y.tfm) \
tex(ybdbciw8y.tfm) \
tex(ybdbcj8c.tfm) \
tex(ybdbcj8t.tfm) \
tex(ybdbcj8y.tfm) \
tex(ybdbcjw8y.tfm) \
tex(ybdbcw8y.tfm) \
tex(ybdbi8c.tfm) \
tex(ybdbi8t.tfm) \
tex(ybdbi8y.tfm) \
tex(ybdbij8c.tfm) \
tex(ybdbij8t.tfm) \
tex(ybdbij8y.tfm) \
tex(ybdbijw8y.tfm) \
tex(ybdbiw8y.tfm) \
tex(ybdbj8c.tfm) \
tex(ybdbj8t.tfm) \
tex(ybdbj8y.tfm) \
tex(ybdbjw8y.tfm) \
tex(ybdbw8y.tfm) \
tex(ybdr08c.tfm) \
tex(ybdr08t.tfm) \
tex(ybdr08y.tfm) \
tex(ybdr0c8c.tfm) \
tex(ybdr0c8t.tfm) \
tex(ybdr0c8y.tfm) \
tex(ybdr0ci8c.tfm) \
tex(ybdr0ci8t.tfm) \
tex(ybdr0ci8y.tfm) \
tex(ybdr0i8c.tfm) \
tex(ybdr0i8t.tfm) \
tex(ybdr0i8y.tfm) \
tex(ybdr18c.tfm) \
tex(ybdr18t.tfm) \
tex(ybdr18y.tfm) \
tex(ybdr1c8c.tfm) \
tex(ybdr1c8t.tfm) \
tex(ybdr1c8y.tfm) \
tex(ybdr1ci8c.tfm) \
tex(ybdr1ci8t.tfm) \
tex(ybdr1ci8y.tfm) \
tex(ybdr1i8c.tfm) \
tex(ybdr1i8t.tfm) \
tex(ybdr1i8y.tfm) \
tex(ybdr28c.tfm) \
tex(ybdr28t.tfm) \
tex(ybdr28y.tfm) \
tex(ybdr2c8c.tfm) \
tex(ybdr2c8t.tfm) \
tex(ybdr2c8y.tfm) \
tex(ybdr2ci8c.tfm) \
tex(ybdr2ci8t.tfm) \
tex(ybdr2ci8y.tfm) \
tex(ybdr2cij8c.tfm) \
tex(ybdr2cij8t.tfm) \
tex(ybdr2cij8y.tfm) \
tex(ybdr2cijw8y.tfm) \
tex(ybdr2ciw8y.tfm) \
tex(ybdr2cj8c.tfm) \
tex(ybdr2cj8t.tfm) \
tex(ybdr2cj8y.tfm) \
tex(ybdr2cjw8y.tfm) \
tex(ybdr2cw8y.tfm) \
tex(ybdr2i8c.tfm) \
tex(ybdr2i8t.tfm) \
tex(ybdr2i8y.tfm) \
tex(ybdr2ij8c.tfm) \
tex(ybdr2ij8t.tfm) \
tex(ybdr2ij8y.tfm) \
tex(ybdr2ijw8y.tfm) \
tex(ybdr2iw8y.tfm) \
tex(ybdr2j8c.tfm) \
tex(ybdr2j8t.tfm) \
tex(ybdr2j8y.tfm) \
tex(ybdr2jw8y.tfm) \
tex(ybdr2w8y.tfm) \
tex(ybdr8c.tfm) \
tex(ybdr8t.tfm) \
tex(ybdr8y.tfm) \
tex(ybdrc8c.tfm) \
tex(ybdrc8t.tfm) \
tex(ybdrc8y.tfm) \
tex(ybdrci8c.tfm) \
tex(ybdrci8t.tfm) \
tex(ybdrci8y.tfm) \
tex(ybdrcij8c.tfm) \
tex(ybdrcij8t.tfm) \
tex(ybdrcij8y.tfm) \
tex(ybdrcijw8y.tfm) \
tex(ybdrciw8y.tfm) \
tex(ybdrcj8c.tfm) \
tex(ybdrcj8t.tfm) \
tex(ybdrcj8y.tfm) \
tex(ybdrcjw8y.tfm) \
tex(ybdrcw8y.tfm) \
tex(ybdri8c.tfm) \
tex(ybdri8t.tfm) \
tex(ybdri8y.tfm) \
tex(ybdrij8c.tfm) \
tex(ybdrij8t.tfm) \
tex(ybdrij8y.tfm) \
tex(ybdrijw8y.tfm) \
tex(ybdriw8y.tfm) \
tex(ybdrj8c.tfm) \
tex(ybdrj8t.tfm) \
tex(ybdrj8y.tfm) \
tex(ybdrjw8y.tfm) \
tex(ybdrw8y.tfm) \
texlive-berenisadf"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontenc.sty) \
tex(nfssext-cfr.sty) \
tex(textcomp.sty) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-berenisadf-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
