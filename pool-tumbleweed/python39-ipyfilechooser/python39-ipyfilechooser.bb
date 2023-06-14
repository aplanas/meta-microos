SUMMARY = "File chooser widget for use in Jupyter/IPython"
DESCRIPTION = "Python file chooser widget for use in Jupyter/IPython in conjunction with ipywidgets"
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-ipyfilechooser-0.6.0-1.7.noarch.rpm"
RPM_HASH = "3f266b35df8a8d199313925017f7b18a9c87d36dcd12cbfed7da025a1940cebc674fd49c17f4bbcfc9d42dc074bad1af3b0f864b5044b8a5d68fc2fc4a546c99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipyfilechooser \
python39-ipyfilechooser \
python3dist-ipyfilechooser"

RDEPENDS:${PN} += "python-abi \
python39-ipywidgets"

inherit rpm
