SUMMARY = "MC event generator for Simulation of High-Energy Reactions of PArticles"
DESCRIPTION = "Sherpa is a Monte Carlo event generator for the Simulation of \
High-Energy Reactions of PArticles in lepton-lepton, lepton-photon, \
photon-photon, lepton-hadron and hadron-hadron collisions. It provides \
complete hadronic final states in simulations of high-energy particle \
collisions. The produced events may be passed into detector \
simulations used by the various experiments. The entire code has been \
written in C++. \
 \
This package provides the source and header files for development with \
Sherpa."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.2.12"

RPM_NAME = "SHERPA-MC-devel-2.2.12-2.12.aarch64.rpm"
RPM_HASH = "e5b13f75757358f9039fe85f67511c2d2eae2a1347ba72c18bb2039e569f8dbb70d89032361835e244ee8c6b683c850afb7796e93bdfa0505ce691122b655168"

RPROVIDES:${PN} += "SHERPA-MC-devel \
SHERPA-MC-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libAhadicDecays.so.0()(64bit) \
libAhadicFormation.so.0()(64bit) \
libAhadicMain.so.0()(64bit) \
libAhadicTools.so.0()(64bit) \
libAmegic.so.0()(64bit) \
libAmegicCluster.so.0()(64bit) \
libAmegicPSGen.so.0()(64bit) \
libAmisic.so.0()(64bit) \
libAmisicModel.so.0()(64bit) \
libAmisicTools.so.0()(64bit) \
libAmplitude.so.0()(64bit) \
libBeam.so.0()(64bit) \
libCSCalculators.so.0()(64bit) \
libCSMain.so.0()(64bit) \
libCSShowers.so.0()(64bit) \
libCSTools.so.0()(64bit) \
libComix.so.0()(64bit) \
libComixAmplitude.so.0()(64bit) \
libComixCluster.so.0()(64bit) \
libComixPhasespace.so.0()(64bit) \
libDipoleSubtraction.so.0()(64bit) \
libDireGauge.so.0()(64bit) \
libDireLorentz.so.0()(64bit) \
libDireMain.so.0()(64bit) \
libDireShower.so.0()(64bit) \
libDireTools.so.0()(64bit) \
libExtraXS.so.0()(64bit) \
libExtraXS1_2.so.0()(64bit) \
libExtraXS1_3.so.0()(64bit) \
libExtraXS2_2.so.0()(64bit) \
libExtraXSCluster.so.0()(64bit) \
libExtraXSNLO.so.0()(64bit) \
libHadronsCurrents.so.0()(64bit) \
libHadronsMEs.so.0()(64bit) \
libHadronsMain.so.0()(64bit) \
libHadronsPSs.so.0()(64bit) \
libHepMC3.so.3()(64bit) \
libLHAPDF-6.5.4.so()(64bit) \
libLundTools.so.0()(64bit) \
libMCatNLOCalculators.so.0()(64bit) \
libMCatNLOMain.so.0()(64bit) \
libMCatNLOShowers.so.0()(64bit) \
libMCatNLOTools.so.0()(64bit) \
libMEToolsColors.so.0()(64bit) \
libMEToolsCurrents.so.0()(64bit) \
libMEToolsExplicit.so.0()(64bit) \
libMEToolsLoops.so.0()(64bit) \
libMEToolsMain.so.0()(64bit) \
libMEToolsSpinCorrelations.so.0()(64bit) \
libMEToolsVertices.so.0()(64bit) \
libModelMain.so.0()(64bit) \
libModelUFO.so.0()(64bit) \
libPDF.so.0()(64bit) \
libPhasicChannels.so.0()(64bit) \
libPhasicDecays.so.0()(64bit) \
libPhasicEnhance.so.0()(64bit) \
libPhasicMain.so.0()(64bit) \
libPhasicProcess.so.0()(64bit) \
libPhasicScales.so.0()(64bit) \
libPhasicSelectors.so.0()(64bit) \
libPhotonsMEs.so.0()(64bit) \
libPhotonsMain.so.0()(64bit) \
libPhotonsPhaseSpace.so.0()(64bit) \
libPhotonsTools.so.0()(64bit) \
libRemnant.so.0()(64bit) \
libSHERPA-MC0 \
libSherpaInitialization.so.0()(64bit) \
libSherpaMain.so.0()(64bit) \
libSherpaPerturbativePhysics.so.0()(64bit) \
libSherpaSingleEvents.so.0()(64bit) \
libSherpaSoftPhysics.so.0()(64bit) \
libSherpaTools.so.0()(64bit) \
libShrimpsBeamRemnants.so.0()(64bit) \
libShrimpsEikonals.so.0()(64bit) \
libShrimpsEvents.so.0()(64bit) \
libShrimpsMain.so.0()(64bit) \
libShrimpsTools.so.0()(64bit) \
libShrimpsXsecs.so.0()(64bit) \
libString.so.0()(64bit) \
libToolsMath.so.0()(64bit) \
libToolsOrg.so.0()(64bit) \
libToolsPhys.so.0()(64bit) \
libZfunctions.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfastjet.so.0()(64bit) \
libfastjetplugins.so.0()(64bit) \
libfastjettools.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgfortran.so.5()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libsiscone.so.0()(64bit) \
libsiscone_spherical.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit)"

inherit rpm
