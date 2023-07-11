SUMMARY = "Vagrantfile syntax files for the emacs editor"
DESCRIPTION = "Optional dependency offering emacs syntax files for Vagrantfile"
LICENSE = "MIT"

PV = "2.3.7"

RPM_NAME = "vagrant-emacs-2.3.7-1.1.noarch.rpm"
RPM_HASH = "d25ca6af0466e12ca189c44e3a8ef9f6074d9338688077806adfc00c0dbe0b24a700041e1c2adc23a630f72516532a2fc41eb64157864dffcd8934f0409e3512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vagrant-emacs"

RDEPENDS:${PN} += "emacs-program \
vagrant"

inherit rpm
