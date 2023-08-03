SUMMARY = "Python extensions for SHERPA-MC"
DESCRIPTION = "Sherpa is a Monte Carlo event generator for the Simulation of \
High-Energy Reactions of PArticles in lepton-lepton, lepton-photon, \
photon-photon, lepton-hadron and hadron-hadron collisions. It provides \
complete hadronic final states in simulations of high-energy particle \
collisions. The produced events may be passed into detector \
simulations used by the various experiments. The entire code has been \
written in C++. \
 \
This package provides the python extensions for Sherpa."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.2.12"

RPM_NAME = "python3-SHERPA-MC-2.2.12-3.3.aarch64.rpm"
RPM_HASH = "013c1737a814a4fbb084517201846bbb07c2f2a97b2d342849b550c4a92dd363897fb740fd160dc1c3ac2dd4c4cec7e8b9e0fe02e5be4a34f99a10410c95eb1b"

RPROVIDES:${PN} += "python-SHERPA-MC \
python3-SHERPA-MC"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libAhadicDecays.so.0 \
libAhadicFormation.so.0 \
libAhadicMain.so.0 \
libAhadicTools.so.0 \
libAmegic.so.0 \
libAmegicCluster.so.0 \
libAmegicPSGen.so.0 \
libAmisic.so.0 \
libAmisicModel.so.0 \
libAmisicTools.so.0 \
libAmplitude.so.0 \
libBeam.so.0 \
libCSCalculators.so.0 \
libCSMain.so.0 \
libCSShowers.so.0 \
libCSTools.so.0 \
libComix.so.0 \
libComixAmplitude.so.0 \
libComixCluster.so.0 \
libComixPhasespace.so.0 \
libDipoleSubtraction.so.0 \
libDireGauge.so.0 \
libDireLorentz.so.0 \
libDireMain.so.0 \
libDireShower.so.0 \
libDireTools.so.0 \
libExtraXS.so.0 \
libExtraXS1-2.so.0 \
libExtraXS1-3.so.0 \
libExtraXS2-2.so.0 \
libExtraXSCluster.so.0 \
libExtraXSNLO.so.0 \
libHadronsCurrents.so.0 \
libHadronsMEs.so.0 \
libHadronsMain.so.0 \
libHadronsPSs.so.0 \
libHepMC3.so.3 \
libLHAPDF-6.5.4.so \
libLundTools.so.0 \
libMCatNLOCalculators.so.0 \
libMCatNLOMain.so.0 \
libMCatNLOShowers.so.0 \
libMCatNLOTools.so.0 \
libMEProcess.so.0 \
libMEToolsColors.so.0 \
libMEToolsCurrents.so.0 \
libMEToolsExplicit.so.0 \
libMEToolsLoops.so.0 \
libMEToolsMain.so.0 \
libMEToolsSpinCorrelations.so.0 \
libMEToolsVertices.so.0 \
libModelMain.so.0 \
libModelUFO.so.0 \
libPDF.so.0 \
libPhasicChannels.so.0 \
libPhasicDecays.so.0 \
libPhasicEnhance.so.0 \
libPhasicMain.so.0 \
libPhasicProcess.so.0 \
libPhasicScales.so.0 \
libPhasicSelectors.so.0 \
libPhotonsMEs.so.0 \
libPhotonsMain.so.0 \
libPhotonsPhaseSpace.so.0 \
libPhotonsTools.so.0 \
libRemnant.so.0 \
libSherpaInitialization.so.0 \
libSherpaMain.so.0 \
libSherpaPerturbativePhysics.so.0 \
libSherpaSingleEvents.so.0 \
libSherpaSoftPhysics.so.0 \
libSherpaTools.so.0 \
libShrimpsBeamRemnants.so.0 \
libShrimpsEikonals.so.0 \
libShrimpsEvents.so.0 \
libShrimpsMain.so.0 \
libShrimpsTools.so.0 \
libShrimpsXsecs.so.0 \
libString.so.0 \
libToolsMath.so.0 \
libToolsOrg.so.0 \
libToolsPhys.so.0 \
libZfunctions.so.0 \
libc.so.6 \
libfastjet.so.0 \
libfastjetplugins.so.0 \
libfastjettools.so.0 \
libgcc-s.so.1 \
libgfortran.so.5 \
libgmp.so.10 \
libm.so.6 \
libsiscone-spherical.so.0 \
libsiscone.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1 \
python-abi"

inherit rpm
