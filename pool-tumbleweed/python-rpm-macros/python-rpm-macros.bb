SUMMARY = "RPM macros for building of Python modules"
DESCRIPTION = "This package contains SUSE RPM macros for Python build automation. \
You should BuildRequire this package unless you are sure that you \
are only building for distros newer than Leap 42.2"
LICENSE = "WTFPL"

PV = "20230609.6fe8111"

RPM_NAME = "python-rpm-macros-20230609.6fe8111-2.1.noarch.rpm"
RPM_HASH = "a4c50bf20914ca5dc7c61e9906a9649ca26716de53600b2f91c575882844950a9cfaaa7207c4efa705fef702d22ad7c635198cdab0788e8dece61c15fffc842a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-rpm-macros \
python2-rpm-macros \
python3-rpm-macros \
rpm-macro--pyproject-anywheeldir \
rpm-macro--pyproject-wheeldir \
rpm-macro--pypy3-bin-suffix \
rpm-macro--python-definitions \
rpm-macro--python-macro-init \
rpm-macro--python-scan-spec \
rpm-macro--python-stash-flavor \
rpm-macro--python-sysconfig-path \
rpm-macro--python-sysconfig-var \
rpm-macro--python-use-flavor \
rpm-macro--rec-macro-helper \
rpm-macro--without-python2 \
rpm-macro-add-python \
rpm-macro-alternative-for \
rpm-macro-if-not-python-kind \
rpm-macro-if-python-kind \
rpm-macro-ifpycache \
rpm-macro-ifpypy3 \
rpm-macro-ifpython2 \
rpm-macro-ifpython3 \
rpm-macro-ifpython310 \
rpm-macro-ifpython311 \
rpm-macro-ifpython312 \
rpm-macro-ifpython38 \
rpm-macro-ifpython39 \
rpm-macro-install-alternative \
rpm-macro-prepare-alternative \
rpm-macro-primary-python \
rpm-macro-py-dist-name \
rpm-macro-py-setup \
rpm-macro-py-shbang-opts \
rpm-macro-py-ver \
rpm-macro-py2-build \
rpm-macro-py2-dist \
rpm-macro-py2-install \
rpm-macro-py2-shbang-opts \
rpm-macro-py2-ver \
rpm-macro-py3-build \
rpm-macro-py3-dist \
rpm-macro-py3-install \
rpm-macro-py3-shbang-opts \
rpm-macro-py3-ver \
rpm-macro-pycache-only \
rpm-macro-pyproject-install \
rpm-macro-pyproject-install-args \
rpm-macro-pyproject-wheel \
rpm-macro-pyproject-wheel-args \
rpm-macro-pypy3-alternative \
rpm-macro-pypy3-bin-suffix \
rpm-macro-pypy3-build \
rpm-macro-pypy3-compile \
rpm-macro-pypy3-fix-shebang \
rpm-macro-pypy3-install \
rpm-macro-pypy3-install-alternative \
rpm-macro-pypy3-only \
rpm-macro-pypy3-prefix \
rpm-macro-pypy3-provides \
rpm-macro-pypy3-pyproject-install \
rpm-macro-pypy3-pyproject-wheel \
rpm-macro-pypy3-reset-alternative \
rpm-macro-pypy3-shbang-opts \
rpm-macro-pypy3-sitearch \
rpm-macro-pypy3-sitelib \
rpm-macro-pypy3-sysconfig-path \
rpm-macro-pypy3-sysconfig-var \
rpm-macro-pypy3-uninstall-alternative \
rpm-macro-pypy3-version \
rpm-macro-pypy3-version-nodots \
rpm-macro-pytest \
rpm-macro-pytest-arch \
rpm-macro-python-alternative \
rpm-macro-python-bin-suffix \
rpm-macro-python-build \
rpm-macro-python-clone \
rpm-macro-python-compileall \
rpm-macro-python-dist-name \
rpm-macro-python-enable-dependency-generator \
rpm-macro-python-exec \
rpm-macro-python-expand \
rpm-macro-python-files \
rpm-macro-python-find-lang \
rpm-macro-python-flavor \
rpm-macro-python-flavored-alternatives \
rpm-macro-python-for-executables \
rpm-macro-python-group-libalternatives \
rpm-macro-python-install \
rpm-macro-python-install-alternative \
rpm-macro-python-libalternatives-reset-alternative \
rpm-macro-python-module \
rpm-macro-python-module-iter \
rpm-macro-python-module-iter-STOP \
rpm-macro-python-module-lua \
rpm-macro-python-prefix \
rpm-macro-python-provides \
rpm-macro-python-sitearch \
rpm-macro-python-sitelib \
rpm-macro-python-subpackages \
rpm-macro-python-sysconfig-path \
rpm-macro-python-sysconfig-var \
rpm-macro-python-uninstall-alternative \
rpm-macro-python-version \
rpm-macro-python-version-nodots \
rpm-macro-python2-alternative \
rpm-macro-python2-bin-suffix \
rpm-macro-python2-build \
rpm-macro-python2-compile \
rpm-macro-python2-dist \
rpm-macro-python2-fix-shebang \
rpm-macro-python2-install \
rpm-macro-python2-install-alternative \
rpm-macro-python2-only \
rpm-macro-python2-prefix \
rpm-macro-python2-provides \
rpm-macro-python2-pyproject-install \
rpm-macro-python2-pyproject-wheel \
rpm-macro-python2-reset-alternative \
rpm-macro-python2-shbang-opts \
rpm-macro-python2-sitearch \
rpm-macro-python2-sitelib \
rpm-macro-python2-sysconfig-path \
rpm-macro-python2-sysconfig-var \
rpm-macro-python2-uninstall-alternative \
rpm-macro-python2-version \
rpm-macro-python2-version-nodots \
rpm-macro-python3-alternative \
rpm-macro-python3-bin-suffix \
rpm-macro-python3-build \
rpm-macro-python3-compile \
rpm-macro-python3-dist \
rpm-macro-python3-fix-shebang \
rpm-macro-python3-install \
rpm-macro-python3-install-alternative \
rpm-macro-python3-only \
rpm-macro-python3-prefix \
rpm-macro-python3-provides \
rpm-macro-python3-pyproject-install \
rpm-macro-python3-pyproject-wheel \
rpm-macro-python3-reset-alternative \
rpm-macro-python3-shbang-opts \
rpm-macro-python3-sitearch \
rpm-macro-python3-sitelib \
rpm-macro-python3-sysconfig-path \
rpm-macro-python3-sysconfig-var \
rpm-macro-python3-uninstall-alternative \
rpm-macro-python3-version \
rpm-macro-python3-version-nodots \
rpm-macro-python310-alternative \
rpm-macro-python310-bin-suffix \
rpm-macro-python310-build \
rpm-macro-python310-compile \
rpm-macro-python310-fix-shebang \
rpm-macro-python310-install \
rpm-macro-python310-install-alternative \
rpm-macro-python310-only \
rpm-macro-python310-prefix \
rpm-macro-python310-provides \
rpm-macro-python310-pyproject-install \
rpm-macro-python310-pyproject-wheel \
rpm-macro-python310-reset-alternative \
rpm-macro-python310-shbang-opts \
rpm-macro-python310-sitearch \
rpm-macro-python310-sitelib \
rpm-macro-python310-sysconfig-path \
rpm-macro-python310-sysconfig-var \
rpm-macro-python310-uninstall-alternative \
rpm-macro-python310-version \
rpm-macro-python310-version-nodots \
rpm-macro-python311-alternative \
rpm-macro-python311-bin-suffix \
rpm-macro-python311-build \
rpm-macro-python311-compile \
rpm-macro-python311-fix-shebang \
rpm-macro-python311-install \
rpm-macro-python311-install-alternative \
rpm-macro-python311-only \
rpm-macro-python311-prefix \
rpm-macro-python311-provides \
rpm-macro-python311-pyproject-install \
rpm-macro-python311-pyproject-wheel \
rpm-macro-python311-reset-alternative \
rpm-macro-python311-shbang-opts \
rpm-macro-python311-sitearch \
rpm-macro-python311-sitelib \
rpm-macro-python311-sysconfig-path \
rpm-macro-python311-sysconfig-var \
rpm-macro-python311-uninstall-alternative \
rpm-macro-python311-version \
rpm-macro-python311-version-nodots \
rpm-macro-python312-alternative \
rpm-macro-python312-bin-suffix \
rpm-macro-python312-build \
rpm-macro-python312-compile \
rpm-macro-python312-fix-shebang \
rpm-macro-python312-install \
rpm-macro-python312-install-alternative \
rpm-macro-python312-only \
rpm-macro-python312-prefix \
rpm-macro-python312-provides \
rpm-macro-python312-pyproject-install \
rpm-macro-python312-pyproject-wheel \
rpm-macro-python312-reset-alternative \
rpm-macro-python312-shbang-opts \
rpm-macro-python312-sitearch \
rpm-macro-python312-sitelib \
rpm-macro-python312-sysconfig-path \
rpm-macro-python312-sysconfig-var \
rpm-macro-python312-uninstall-alternative \
rpm-macro-python312-version \
rpm-macro-python312-version-nodots \
rpm-macro-python38-alternative \
rpm-macro-python38-bin-suffix \
rpm-macro-python38-build \
rpm-macro-python38-compile \
rpm-macro-python38-fix-shebang \
rpm-macro-python38-install \
rpm-macro-python38-install-alternative \
rpm-macro-python38-only \
rpm-macro-python38-prefix \
rpm-macro-python38-provides \
rpm-macro-python38-pyproject-install \
rpm-macro-python38-pyproject-wheel \
rpm-macro-python38-reset-alternative \
rpm-macro-python38-shbang-opts \
rpm-macro-python38-sitearch \
rpm-macro-python38-sitelib \
rpm-macro-python38-sysconfig-path \
rpm-macro-python38-sysconfig-var \
rpm-macro-python38-uninstall-alternative \
rpm-macro-python38-version \
rpm-macro-python38-version-nodots \
rpm-macro-python39-alternative \
rpm-macro-python39-bin-suffix \
rpm-macro-python39-build \
rpm-macro-python39-compile \
rpm-macro-python39-fix-shebang \
rpm-macro-python39-install \
rpm-macro-python39-install-alternative \
rpm-macro-python39-only \
rpm-macro-python39-prefix \
rpm-macro-python39-provides \
rpm-macro-python39-pyproject-install \
rpm-macro-python39-pyproject-wheel \
rpm-macro-python39-reset-alternative \
rpm-macro-python39-shbang-opts \
rpm-macro-python39-sitearch \
rpm-macro-python39-sitelib \
rpm-macro-python39-sysconfig-path \
rpm-macro-python39-sysconfig-var \
rpm-macro-python39-uninstall-alternative \
rpm-macro-python39-version \
rpm-macro-python39-version-nodots \
rpm-macro-pythons \
rpm-macro-pyunittest \
rpm-macro-pyunittest-arch \
rpm-macro-reset-alternative \
rpm-macro-system-python \
rpm-macro-uninstall-alternative"

RDEPENDS:${PN} += ""

inherit rpm
