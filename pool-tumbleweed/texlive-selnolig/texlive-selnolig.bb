SUMMARY = "Selectively disable typographic ligatures"
DESCRIPTION = "The package suppresses typographic ligatures selectively, i.e., \
based on predefined search patterns. The search patterns focus \
on ligatures deemed inappropriate because they span morpheme \
boundaries. For example, the word shelfful, which is mentioned \
in the TeXbook as a word for which the ff ligature might be \
inappropriate, is automatically typeset as shelf\\/ful rather \
than as shel{ff}ul. For English and German language documents, \
the package provides extensive rules for the selective \
suppression of so-called 'common' ligatures. These comprise the \
ff, fi, fl, ffi, and ffl ligatures as well as the ft and fft \
ligatures. Other f-ligatures, such as fb, fh, fj and fk, are \
suppressed globally, while exceptions are made for names and \
words of non-English/German origin, such as Kafka and fjord. \
For English language documents, the package further provides \
ligature suppression macros for a number of so-called \
'discretionary' or 'rare' ligatures such as ct, st, and sp. The \
package requires use of a recent LuaLaTeX format (for example \
those from TeX Live 2012 or 2013, or MiKTeX 2.9)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.302svn38721"

RPM_NAME = "texlive-selnolig-2023.201.0.0.302svn38721-53.1.noarch.rpm"
RPM_HASH = "1260aeaad8d2bae8a370f0fa75d009af9a72a8d92c129d05e603065683991d173e80faec849216fd13a9b120ff0f95fce6bffd086598fd8d4e8a7047d53895cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(selnolig-english-hyphex.sty) \
tex(selnolig-english-patterns.sty) \
tex(selnolig-german-hyphex.sty) \
tex(selnolig-german-patterns.sty) \
tex(selnolig.sty) \
texlive-selnolig"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifluatex.sty) \
tex(luatexbase.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
