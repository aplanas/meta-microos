SUMMARY = "A tool for creating document structures based on templates"
DESCRIPTION = "TeXplate is a tool for creating document structures based on \
templates. The application name is a word play on TeX and \
template, so the purpose seems quite obvious: we want to \
provide an easy and straightforward framework for reducing the \
typical code boilerplate when writing TeX documents. Also note \
that one can easily extrapolate the use beyond articles and \
theses: the application is powerful enough to generate any \
text-based structure, given that a corresponding template \
exists."
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.0.4svn61719"

RPM_NAME = "texlive-texplate-2023.209.1.0.4svn61719-55.1.noarch.rpm"
RPM_HASH = "0ae80e1e20290aed6b40ce99b109bab4c6e0063b520a63507418d290886e5e97d9dae71c24e9ceff38a5a07f93521ddfc45d75c6bfb8f612ff8ab01f843b6c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texplate.jar \
texlive-texplate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
java \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texplate-bin"

inherit rpm
