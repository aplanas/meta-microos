SUMMARY = "MC event generator for Simulation of High-Energy Reactions of PArticles"
DESCRIPTION = "Sherpa is a Monte Carlo event generator for the Simulation of \
High-Energy Reactions of PArticles in lepton-lepton, lepton-photon, \
photon-photon, lepton-hadron and hadron-hadron collisions. It provides \
complete hadronic final states in simulations of high-energy particle \
collisions. The produced events may be passed into detector \
simulations used by the various experiments. The entire code has been \
written in C++. \
 \
This package provides the shared libraries for Sherpa."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.2.12"

RPM_NAME = "libSHERPA-MC0-2.2.12-2.12.aarch64.rpm"
RPM_HASH = "e52338500381b4c5dd81726f62a9b28f7135ba65b264a692684bf2f71129a420a602b0488593b9285d430bd5bc5b6024fb6418f88b4d414ab2366c03d4d0d848"

RPROVIDES:${PN} += "libAhadicDecays.so.0()(64bit) \
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
libCT10Sherpa.so.0()(64bit) \
libCT12Sherpa.so.0()(64bit) \
libCTEQ6Sherpa.so.0()(64bit) \
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
libGRVSherpa.so.0()(64bit) \
libHadronsCurrents.so.0()(64bit) \
libHadronsMEs.so.0()(64bit) \
libHadronsMain.so.0()(64bit) \
libHadronsPSs.so.0()(64bit) \
libLHAPDFSherpa.so.0()(64bit) \
libLundTools.so.0()(64bit) \
libMCatNLOCalculators.so.0()(64bit) \
libMCatNLOMain.so.0()(64bit) \
libMCatNLOShowers.so.0()(64bit) \
libMCatNLOTools.so.0()(64bit) \
libMEProcess.so.0()(64bit) \
libMEToolsColors.so.0()(64bit) \
libMEToolsCurrents.so.0()(64bit) \
libMEToolsExplicit.so.0()(64bit) \
libMEToolsLoops.so.0()(64bit) \
libMEToolsMain.so.0()(64bit) \
libMEToolsSpinCorrelations.so.0()(64bit) \
libMEToolsVertices.so.0()(64bit) \
libMRST01LOSherpa.so.0()(64bit) \
libMRST04QEDSherpa.so.0()(64bit) \
libMRST99Sherpa.so.0()(64bit) \
libMSTW08Sherpa.so.0()(64bit) \
libModelMain.so.0()(64bit) \
libModelUFO.so.0()(64bit) \
libNNPDFSherpa.so.0()(64bit) \
libPDF.so.0()(64bit) \
libPDFESherpa.so.0()(64bit) \
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
libSHERPA-MC \
libSHERPA-MC0 \
libSHERPA-MC0(aarch-64) \
libSherpaAnalyses.so.0()(64bit) \
libSherpaAnalysis.so.0()(64bit) \
libSherpaAnalysisTools.so.0()(64bit) \
libSherpaAnalysisTrigger.so.0()(64bit) \
libSherpaFusing.so.0()(64bit) \
libSherpaHEFT.so.0()(64bit) \
libSherpaHepMC3Output.so.0()(64bit) \
libSherpaHiggs.so.0()(64bit) \
libSherpaInitialization.so.0()(64bit) \
libSherpaMain.so.0()(64bit) \
libSherpaObservables.so.0()(64bit) \
libSherpaPerturbativePhysics.so.0()(64bit) \
libSherpaPythia.so.0()(64bit) \
libSherpaRivetAnalysis.so.0()(64bit) \
libSherpaSM.so.0()(64bit) \
libSherpaSingleEvents.so.0()(64bit) \
libSherpaSoftPhysics.so.0()(64bit) \
libSherpaTauPi.so.0()(64bit) \
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
libZfunctions.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libHepMC3.so.3()(64bit) \
libHepMC3search.so.4()(64bit) \
libLHAPDF-6.5.4.so()(64bit) \
libRivet-3.1.7.so()(64bit) \
libSHERPA-MC-config \
libYODA-1.9.7.so()(64bit) \
libc.so.6()(64bit) \
libfastjet.so.0()(64bit) \
libfastjetcontribfragile.so()(64bit) \
libfastjetplugins.so.0()(64bit) \
libfastjettools.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libsiscone.so.0()(64bit) \
libsiscone_spherical.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
