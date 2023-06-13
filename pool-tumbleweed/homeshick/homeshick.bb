SUMMARY = "Dotfile synchronizer based on Git and Bash"
DESCRIPTION = "Homeshick is a tool for users to manage configuration files, also known as \
dotfiles. It leverages Git repositories to store and version dotfiles, and to \
synchronize dotfile repositories between accounts and/or machines. \
 \
For example, this allows managing personal dotfiles alongside emacs or vim \
plugins without clutter. It also makes it easy to install large external \
frameworks, such as oh-my-zsh, found on sites like https://dotfiles.github.io/."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "homeshick-2.0.1-1.1.noarch.rpm"
RPM_HASH = "fd686e595a6b5807fc0f6b8813ddba52f1e64ce7c4de251043d199d9b4e0f033114c7713868cf85e632c1ecd03704316c84091dcf71208d2a76395b83d30e2a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "homeshick"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
bash \
git"

inherit rpm
